package com.intexsoft.meetup.examples.pattern;

public class WorkWeekDaySwitchExample {
    public static void main(String[] args) {
        System.out.println(formatterPatternSwitch(1L));
    }

    public static void handleDay_old(WorkWeekDay animal) {
        String dayDescription;
        switch (animal) {
            case MONDAY:
            case TUESDAY:
            case THURSDAY: {
                dayDescription = "Just another work day.";
                break;
            }
            case WEDNESDAY: {
                dayDescription = "Small friday!";
                break;
            }
            case FRIDAY: {
                dayDescription = "IT IS FRIDAY!";
                break;
            }
            default: {
                dayDescription = "IT IS WEEKEND!";
            }
        }
        System.out.println(dayDescription);
    }

    public static void handleDay_step_1(WorkWeekDay animal) {
        String dayDescription;
        switch (animal) {
            case MONDAY, TUESDAY, THURSDAY: {
                dayDescription = "Just another work day.";
                break;
            }
            case WEDNESDAY: {
                dayDescription = "It is small friday!";
                break;
            }
            case FRIDAY: {
                dayDescription = "IT IS FRIDAY!";
                break;
            }
            default: {
                dayDescription = "IT IS WEEKEND!";
            }
            System.out.println(dayDescription);
        }
    }

    public static void handleDay_step_2(WorkWeekDay animal) {
        String dayDescription;
        switch (animal) {
            case MONDAY, TUESDAY, THURSDAY -> dayDescription = "Just another work day.";
            case WEDNESDAY -> dayDescription = "It is small friday!";
            case FRIDAY -> dayDescription = "IT IS FRIDAY!";
            default -> dayDescription = "IT IS WEEKEND!";
        }
        System.out.println(dayDescription);
    }

    public static void handleDay_step_3(WorkWeekDay animal) {
        String dayDescription = switch (animal) {
            case MONDAY, TUESDAY, THURSDAY -> "Just another work day.";
            case WEDNESDAY -> "It is small friday!";
            case FRIDAY -> "IT IS FRIDAY!";
            default -> "IT IS WEEKEND!";
        };
        System.out.println(dayDescription);
    }

    public static void handleDay_step_0_1(WorkWeekDay animal) {
        String dayDescription = switch (animal) {
            case MONDAY, TUESDAY, THURSDAY -> "Just another work day.";
            case WEDNESDAY -> {
                System.out.println("But you still need to work.");
                yield "It is small friday!";
            }
            case FRIDAY -> "IT IS FRIDAY!";
            default -> "IT IS WEEKEND!";
        };
        System.out.println(dayDescription);
    }

    static String formatterPatternSwitch(Object o) {
        return switch (o) {
            case Integer i -> String.format("int %d", i);
            case Long l -> String.format("long %d", l);
            case Double d -> String.format("double %f", d);
            case String s -> String.format("String %s", s);
            default -> o.toString();
        };
    }
}
