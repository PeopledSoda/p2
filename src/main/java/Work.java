public class Work {

    privat User user;

    public Work(User user){
        this.user=user;
    }
    private void showAdminMenu(){}

    public void showMenu(){
        switch (user.getRole()){
            case "ADMIN".showAdminMenu();break;
            case "USER".showUserMenu();break;

        }
    }

}
