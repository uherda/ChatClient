import models.chatClients.ChatClient;
import models.chatClients.InMemoryChatClient;
import models.gui.MainFrame;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");

        //ChatClient chatClient = new InMemoryChatClient();
        //chatClient.login("uherd");

        //chatClient.sendMessage("ahoj");

        //chatClient.logout();

        MainFrame mainFrame = new MainFrame(800, 400);
    }

}
