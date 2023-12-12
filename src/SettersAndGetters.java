public class SettersAndGetters {

        public static void main(String[] args) {
            Person person1 = new Person();
            person1.setName("Полина");
            person1.setAge(5);
            System.out.println("Вывод значения в main методе: "+ person1.getName());
            System.out.println("Вывод значения в main методе: "+ person1.getAge());
            //person1.speak();
            Person person2 = new Person();

        }
    }
    class Person{
        private String name;
        private int age;
        public void setName(String userName){
            if(userName.isEmpty()){
                System.out.println("Ты ввел пустое имя");
            } else {
                name = userName;}
        }
        public String getName(){
            return name;
        }
        public void setAge(int userAge){
            if (userAge<0){
                System.out.println("Недопустимое значение");
            }
            else {
            age = userAge;}
        }
        public int getAge(){
            return age;
        }

        void speak(){
            for(int i=0; i<3; i++){
                System.out.println("Меня зовут "+name+", Мне "+age);}
        }
        void sayHello(){
            System.out.println("Привет!");
        }

}
