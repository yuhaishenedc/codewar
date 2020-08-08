import java.util.*;
public class test{
    public static class Subject implements Cloneable {

        private String name;

        public Subject(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            //Subject 如果也有引用类型的成员属性，也应该和 Student 类一样实现
            return super.clone();
        }

        @Override
        public String toString() {
            return "[Subject: " + this.hashCode() + ",name:" + name + "]";
        }
    }


    public static class Student implements Cloneable {

        //引用类型
        private Subject subject;
        //基础数据类型
        private String name;
        private int age;

        public Subject getSubject() {
            return subject;
        }

        public void setSubject(Subject subject) {
            this.subject = subject;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        /**
         *  重写clone()方法
         * @return
         */
        @Override
        public Object clone() {
            //深拷贝
            try {
                // 直接调用父类的clone()方法
                Student student = (Student) super.clone();
                student.subject = (Subject) subject.clone();
                return student;
            } catch (CloneNotSupportedException e) {
                return null;
            }
        }

        @Override
        public String toString() {
            return "[Student: " + this.hashCode() + ",subject:" + subject + ",name:" + name + ",age:" + age + "]";
        }
    }






    public static void main(String[] args){
        Subject subject = new Subject("yuwen");
        Student studentA = new Student();
        studentA.setSubject(subject);
        studentA.setName("Lynn");
        studentA.setAge(20);
        Student studentB = (Student) studentA.clone();
        studentB.setName("Lily");
        studentB.setAge(18);
        Subject subjectB = studentB.getSubject();
        subjectB.setName("lishi");
        System.out.println("studentA:" + studentA.toString());
        System.out.println("studentB:" + studentB.toString());
    }

}

