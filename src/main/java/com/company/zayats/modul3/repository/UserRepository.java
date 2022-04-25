package com.company.zayats.modul3.repository;

import com.company.zayats.modul3.entity.Message;
import com.company.zayats.modul3.mapper.ActivityMapper;

import java.util.List;
import java.util.Scanner;

public class UserRepository {
    private final Scanner scanner = new Scanner(System.in);
    private final MessageRepository messageRepository = new MessageRepository();
    private final ActivityRepository activityRepository = new ActivityRepository();
    private final EquipmentRepository equipmentRepository = new EquipmentRepository();

    public void doActions() {
        StringBuilder builder = new StringBuilder("Select an action:\n");
        builder.append(0).append(") Exit\n");
        builder.append(1).append(") Search for text in storage\n");
        builder.append(2).append(") Top-5 subscribers who made the most calls\n");
        builder.append(3).append(") Тоp-5 subscribers who sent the most sms\n");
        builder.append(4).append(") Тоp-5 subscribers who made the most internet access\n");
        builder.append(5).append(") The most popular service\n");
        builder.append(6).append(") The most popular device on the web");

        do {
            System.out.println(builder);
            String command = scanner.next();
            if (command.equals("0")) {
                System.exit(0);
            } else if (command.equals("1")) {
                System.out.println("Enter text to search, for example: plan to explode president");
                scanner.nextLine();
                String input = scanner.nextLine();
                List<Message> messageList = messageRepository.fullTextSearchThroughMessageStorage(input);
                if (messageList.size() == 0) {
                    System.out.println("No matches found");
                } else {
                    messageList.forEach(System.out::println);
                }
            } else if (command.equals("2")) {
                System.out.println("the most calls:");
                System.out.println(ActivityMapper.mapToString(
                        activityRepository.getTopFiveConsumersOfActivity("Call")));
            } else if (command.equals("3")) {
                System.out.println("the most sent message:");
                System.out.println(ActivityMapper.mapToString(
                        activityRepository.getTopFiveConsumersOfActivity("Message")));
            } else if (command.equals("4")) {
                System.out.println("the most internet access:");
                System.out.println(ActivityMapper.mapToString(
                        activityRepository.getTopFiveConsumersOfActivity("Internet")));
            } else if (command.equals("5")) {
                System.out.println(activityRepository.getMostPopularActivity());
            } else if (command.equals("6")) {
                System.out.println("The most popular device on the web: ");
                System.out.println(ActivityMapper.mapToString(
                        equipmentRepository.getMostPopularEquipment()));
            }
            else {
                System.out.println("Wrong command");
            }
        } while (true);
    }
}
