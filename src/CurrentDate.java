public class CurrentDate {
        private int day;
        private int month;
        private int year;


        public CurrentDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }




        public void setDay(int day) {
            this.day = day;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public void setYear(int year) {
            this.year = year;
        }



        public int getDay() {
            return day;
        }

        public int getMonth(){
            return month;
        }

        public int getYear(){
            return year;
        }


        public String ToString() {
            return "CurrentDate{" +
                    "day=" + getDay() +
                    ", month=" + getMonth() +
                    ", year=" + getYear() +
                    "}";
        }

        public String DisplayDate() {
            return getDay() + "/" + getMonth() + "/" + getYear();
        }

        public boolean equals(CurrentDate d) {
            return this == d;
        }
}

