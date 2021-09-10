package com.company;

import java.util.Scanner;

public class Main {


    //создать класс с id пароль почта имя. Сделать меню 1 пункт добавить нью пользователя. 2 просмотр всех пользователей. 3 удаление из массива(заменить на null). 4 изменения данных 5.выход.Макс 100 юзеров
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User [] users=new User[100];
        String name;
        String email;
        String password;


        while (true){
            System.out.println("Выберите действия:\n 1-Добавить нового пользователя\n 2-Список пользователей \n 3-Удалить пользователя\n 4-Изменение данных\n 5-Выход");
            int move =in.nextInt();
            in.nextLine();
            if (move == 1){

                int newUserId = User.getMaxId();
                System.out.println("Введите имя пользователя: ");
                name = (in.nextLine());
                System.out.println("Введите почту: ");
                email = (in.nextLine());
                System.out.println("Введите пароль: ");
                password = (in.nextLine());

                users[newUserId] = new User(name,email, password);

                System.out.printf("Id пользователя: %d Имя: %s, Почта: %s, Пароль: %s УСПЕШНО ДОБАВЛЕН\n",User.getMaxId(), name, email, password);
                System.out.println(User.getMaxId());
            }
            else if (move == 2){
                System.out.println("Cписок пользователей:\n ");
                for(int i = 0; i < users.length; i++){
                    if (users[i] != null)
                    System.out.printf("Id пользователя: %d Имя: %s, Почта: %s, Пароль: %s \n",users[i].getId() , users[i].getName(), users[i].getEmail(), users[i].getPassword());
                }
            }
            else if (move == 3){
                System.out.println("Введите id пользователя которого нужно удалить: ");
                int i = in.nextInt();
                if (i == users[i].getId()){
                    users[i] = null;
                }
            }
            else{
                break;
            }
        }
        in.close();


    }
}
