public class Main {
    public static void main(String[] args) {

        /*ПЕРВЫЙ ТАСК*/

        String Name1 = "ivanov";
        String Name2 = "ivan";
        String Name3 = "ivanovich";
        String fullName = Name1 + " " + Name2 + " " + Name3;
        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println();



        /*ВТОРОЙ ТАСК*/

        String si = "";
        si = si + fullName.substring(0, 1).toUpperCase();
        for (int i = 1; i <= fullName.length() - 1; i++) {
            if(" ".equals(fullName.substring(i - 1, i))) {
                si = si + fullName.substring(i, i + 1).toUpperCase();
            } else {
                si = si + fullName.substring(i, i + 1);
            }
        }
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + si);
        System.out.println();
        System.out.println();



        /*ТРЕТИЙ ТАСК*/

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName);
    }
}