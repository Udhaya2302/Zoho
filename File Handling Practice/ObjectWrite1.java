import java.io.*;

class ObjectWrite1 {
    public static void main(String[] args) {
        String path = "C:\\Users\\Administrator\\Documents\\File Handling Practice\\newFileReadAndWrite.txt";
        File file = new File(path);

        User u1 = new User(1, "Udhay", true);
        User u2 = new User(2, "Karuna", true);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(u1);
            oos.writeObject(u2);
            oos.close();

            System.out.println("Objects written successfully");

            // Now, you can add code to read the objects back from the file if needed.
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class User implements Serializable {

    private static final long serialVersionUID = 1L;

    int id;
    String name;
    boolean come;

    User(int id, String name, boolean come) {
        this.id = id;
        this.name = name;
        this.come = come;
    }
}
