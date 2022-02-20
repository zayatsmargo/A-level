package com.company.zayats.modul3.repository;

import com.company.zayats.hw24.HibernateUtil;
import com.company.zayats.modul3.entity.Message;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class MessageRepository {

    public void saveMessage(Message message) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(message);
        transaction.commit();
        session.close();
    }

    public List<Message> searchThroughMessageStorageByText(String text) {
        StringBuilder builder = new StringBuilder("select s from Message s where ");
        String[] splitText = text.split(" ");
        if (splitText.length == 0) {
            throw new IllegalStateException();
        } else if (splitText.length != 1) {
            for (int i = 0; i < splitText.length - 1; i++) {
                builder.append("s.contentMessage like '%")
                        .append(splitText[i])
                        .append("%' and ");
            }
        }
        builder.append("s.contentMessage like '%")
                .append(splitText[splitText.length - 1])
                .append("%'");
        String query = builder.toString();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        List<Message> messageList = session
                .createQuery(query, Message.class)
                .list();
        transaction.commit();
        session.close();
        return messageList;
    }

    public List<Message> fullTextSearchThroughMessageStorage(String text) {
        StringBuilder builder = new StringBuilder();
        String[] splitText = text.split(" ");
        if (splitText.length == 0) {
            throw new IllegalStateException();
        } else if (splitText.length > 1) {
            for (int i = 0; i < splitText.length - 1; i++) {
                builder.append(splitText[i]).append(" | ");
            }
        }
        builder.append(splitText[splitText.length - 1]);
        String preparedText = builder.toString();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        List<Message> messageList = session
                .createNativeQuery("select * " +
                        "from activities " +
                        "where to_tsvector('english', content_message) @@ to_tsquery('english', :text)", Message.class)
                        .setParameter("text", preparedText)
                        .list();
        transaction.commit();
        session.close();
        return messageList;
    }
}
