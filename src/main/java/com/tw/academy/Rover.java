package com.tw.academy;

import java.util.Arrays;

import static java.lang.Integer.valueOf;

public class Rover {
    private Integer x;
    private Integer y;
    private String direction;

    public Rover(String initialStatus) {
        String[] status = initialStatus.split(" ");
        x = valueOf(status[0]);
        y = valueOf(status[1]);
        direction = status[2];
    }

    private String showStatus() {
        return x + " " + y + " " + direction;
    }

    public String execute(String statement) {
        Arrays.asList(statement.split("(?!^)")).forEach(cmd -> on(cmd));
        return showStatus();
    }

    private void on(String demand) {
        if ("L".equalsIgnoreCase(demand)) {
            switch (direction) {
                case "W":
                    direction = "S";
                    break;
                case "S":
                    direction = "E";
                    break;
                case "E":
                    direction = "N";
                    break;
                case "N":
                    direction = "W";
                    break;
            }
        }

        if ("R".equalsIgnoreCase(demand)) {
            switch (direction) {
                case "W":
                    direction = "N";
                    break;
                case "N":
                    direction = "E";
                    break;
                case "E":
                    direction = "S";
                    break;
                case "S":
                    direction = "W";
                    break;
            }
        }

        if ("M".equalsIgnoreCase(demand)) {
            switch (direction) {
                case "W":
                    x--;
                    break;
                case "S":
                    y--;
                    break;
                case "E":
                    x++;
                    break;
                case "N":
                    y++;
                    break;
            }
        }
    }

}
