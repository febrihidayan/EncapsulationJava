public class FebriGames {

    public static void main(String[] args) {

        FebriEncapsulation myObj = new FebriEncapsulation();

        myObj.setSpeed(100);
        myObj.setMessages("Mobilku cukup lambat");
        System.out.println(myObj.getSpeed());
        System.out.println(myObj.getMessages());
        
        myObj.setMessages("Saya ingin menambahkannya");
        myObj.setSpeed(99999);
        System.out.println(myObj.getMessages());
        System.out.println(myObj.getSpeed());
        
        myObj.setMessages("Saatnya lompat");
        myObj.setJump(9991);
        System.out.println(myObj.getMessages());
        System.out.println("Kekuatan lompat " + myObj.getJump());

    }

}