package com.asma.recyclerview;

public class Food {


        private String title;


        // why are you using int for image "your images in drawable folder"
        private int image;

        public Food(String title, int image) {
            this.title = title;
            this.image = image;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getImage() {
            return image;
        }

        public void setImage(int image) {
            this.image = image;
        }
    }
