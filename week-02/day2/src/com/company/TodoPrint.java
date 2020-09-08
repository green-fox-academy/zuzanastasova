package com.company;

    public class TodoPrint {
        public static void main(String... args){
            String todoText = " - Buy milk\n";
            String my = "My todo:";
            String games = " - Download games";
            String diablo = " - Diablo";
            diablo = diablo.indent(4);
            todoText = my + "\n" + todoText + games + "\n" + diablo;
            // Expected output:
            // My todo:
            //  - Buy milk
            //  - Download games
            //      - Diablo

            System.out.println(todoText);
        }

}
