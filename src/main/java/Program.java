import java.util.Scanner;
public class Program {

    private User[] dataBase;

    private int countUsers;

    public Program(){
        dataBase=new User[100];
        dataBase[0]=new User("aigiz","qwerty","ADMIN");
        dataBase[1]=new User("danya","qwerty1","user");;
        dataBase[2]=new User("sanya","qwerty2","ADMIN");;
        dataBase[3]=new User("frog","qwertywa","user");;
        dataBase[4]=new User("pig","qwertyu","user");;
        dataBase[5]=new User("aigiz777","qwerty777","user");;

        countUsers=6;

    }
    public User signIn(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String login = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();

        User user = checkUser(login,password);
        return user;
    }

    public User checkUser(String login,String password){
        for (int i=0;i<countUsers;i++) {
            if(login.equals(dataBase[i].getLogin())&&password.equals(dataBase[i].getPassword())) {
                return dataBase[i];
                }
            }
        return null;
        }





    public void run(){

    }

}
