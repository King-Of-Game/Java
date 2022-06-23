package com.jack.tools;

public class Test {
    public static void main(String[] args) {
//        testDateTool();
//        testFileTool();
        testRandomTool();
    }


    private static void testDateTool(){
        DateTools dateTools = DateTools.getInstance();

        // test zero's timestamp today
        long timestamp = dateTools.getToday0Timestamp(0);
        System.out.println(timestamp);

        String formatTime = dateTools.timestampToStr(timestamp);
        System.out.println(formatTime);

        timestamp = dateTools.strTimeToTimestamp(formatTime, 1);
        System.out.println(timestamp);

        // test now timestamp
        timestamp = dateTools.getNowTimestamp(0);
        System.out.println(timestamp);

        formatTime = dateTools.timestampToStr(timestamp);
        System.out.println(formatTime);

        timestamp = dateTools.strTimeToTimestamp(formatTime, 1);
        System.out.println(timestamp);
    }

    private static void testFileTool(){
        FileTools fileTools = FileTools.getInstance();
        fileTools.recursionCreateFile(1, 2, 1, "./data", "test", "jack.txt");

        fileTools.recursionDelFolder("./data");
    }


    private static void testRandomTool(){
        RandomTools randomTools = RandomTools.getInstance();
        int randomNum = randomTools.randomNumber100();
        System.out.println(randomNum);

        randomNum = randomTools.randomNumber1000();
        System.out.println(randomNum);
    }
}
