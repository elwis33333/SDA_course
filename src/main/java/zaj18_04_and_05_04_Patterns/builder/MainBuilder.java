package zaj18_04_and_05_04_Patterns.builder;

public class MainBuilder {
    public static void main(String[] args) {
        RoomReservation rr =
                new RoomReservation
                        .ReservationRoomBuilder(8, 16, 20)
                        .enableAirCondition()
                        .isTeleconference()
                        .build();

        System.out.println(rr);
    }
}
