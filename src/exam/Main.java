package exam;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        TimetableManager t = new TimetableManager();
        t.loadTimetable("C:\\Users\\lemon\\OneDrive\\바탕 화면\\schedule.csv");

        // 강의실 시간표 출력
        String room = "07-303 화학물질센터실습실";
        List<String> formattedSchedule = t.getFormattedSchedule(room);

        for (String entry : formattedSchedule) {
            System.out.println(entry);
        }

        boolean isInUse = t.isRoomInUse(room);
        if (isInUse) {
            System.out.println("현재 강의실이 사용 중입니다.");
        } else {
            System.out.println("현재 강의실이 비어 있습니다.");
        }

    }
}
