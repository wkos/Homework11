package pl.wkos.homework112;

public class NameHolderUtils {
    public static void addName(NamesHolder namesHolder, String name) {
        try {
            namesHolder.add(name);
            System.out.println(namesHolder.toString());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void removeName(NamesHolder namesHolder, String name) {
        try {
            namesHolder.remove(name);
            System.out.println(namesHolder.toString());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
