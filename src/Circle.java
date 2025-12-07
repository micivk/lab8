public class Circle {
        // Access modifier private is used for encapsulation
        // It protects the data from being modified directly by other classes, allowing us to control access via getters and setters later
        private double radius;


        //Constructor
        public Circle(double radius) {
            this.radius = radius;
        }



        public double getRadius() {
            return radius;
        }
        public void setRadius(double radius) {
            this.radius = radius;
        }



        public double calculateArea(){
            return Math.PI * Math.pow(radius, 2);
        }
        public double calculateCircumference(){
            return 2*Math.PI * radius;
        }


}
