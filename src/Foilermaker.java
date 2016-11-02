import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Foilermaker.java
 *
 * Controller class that mediates access to the model and the view.
 *
 * @author Brandon Nguyen, nguye299@purdue.edu, Lab Section G06
 *
 * @version October 29, 2016
 *
 */
public class Foilermaker {

    FMModel model;
    FMView view;

    public Foilermaker () {
        model = new FMModel(this);
        view = new FMView(this);
    }

    public void startGame() {
        connectToServer();
    }


    // Networking
    public void connectToServer() {

        String serverHost = view.serverHostInput.getText();
        int portNumber = Integer.parseInt(view.portNumberInput.getText());

        try {
            System.out.println("Connecting to Server...");
            Socket socket = new Socket (serverHost, portNumber);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        } catch (IOException e) {

        }

    }

    public static void main(String[] args) {
        Foilermaker game = new Foilermaker();
        game.startGame();

    }
}