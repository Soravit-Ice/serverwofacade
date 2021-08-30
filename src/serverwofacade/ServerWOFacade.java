/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serverwofacade;

import java.util.Scanner;

public class ServerWOFacade {
    public static void main(String[] args) {
        FacadeController facadeController = new FacadeController();
        Scanner sc = new Scanner(System.in);
        System.out.println("StartServer : s \nStopServer : q \n");
        String input_from_keyboard = sc.next();
        switch (input_from_keyboard){
            case "s":
                facadeController.startServer();
                break;
            case "q":
                facadeController.stopServer();
                break;
        }

    }
    
}
