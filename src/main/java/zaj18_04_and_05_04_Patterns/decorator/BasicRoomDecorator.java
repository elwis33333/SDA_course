package zaj18_04_and_05_04_Patterns.decorator;

class BasicRoomDecorator implements Room {

    protected Room room;

    public BasicRoomDecorator(Room room) {
        this.room = room;
    }

    public void meeting() {
        this.room.meeting();
        System.out.println("Perform meeting with basic equipment room");
    }

    @Override
    public void show() {
        this.room.show();
    }
}
