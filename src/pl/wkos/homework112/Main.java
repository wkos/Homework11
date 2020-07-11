package pl.wkos.homework112;

public class Main {
    public static void main(String[] args) {
        NamesHolder namesHolder = new NamesHolder(3);
        System.out.println(namesHolder.toString());
//        try {
//            namesHolder.add("Ala");
//            System.out.println(namesHolder.toString());
//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//            namesHolder.add("Ela");
//            System.out.println(namesHolder.toString());
//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//            namesHolder.add("Ola");
//            System.out.println(namesHolder.toString());
//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//            namesHolder.remove("Ola");
//            System.out.println(namesHolder.toString());
//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//            namesHolder.add("Ela");
//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//            namesHolder.add("Ola");
//            System.out.println(namesHolder.toString());
//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//            namesHolder.add("Ula");
//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }


        NameHolderUtils.addName(namesHolder, "Ala");
        System.out.println(namesHolder.toString());

        NameHolderUtils.addName(namesHolder, "Ela");
        System.out.println(namesHolder.toString());

        NameHolderUtils.addName(namesHolder, "Ola");
        System.out.println(namesHolder.toString());

        namesHolder.remove("Ola");
        System.out.println(namesHolder.toString());

        NameHolderUtils.addName(namesHolder, "Ela");

        NameHolderUtils.addName(namesHolder, "Ola");
        System.out.println(namesHolder.toString());

        NameHolderUtils.addName(namesHolder, "Ula");

    }
}
