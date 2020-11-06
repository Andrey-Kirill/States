package com.example.tests_states;

public class State {

        public String name; // название
        public String capital;  // столица
        public int flagResource; // ресурс флага

        public State(String name, String capital, int flag){
            this.name=name;
            this.capital=capital;
            this.flagResource=flag;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCapital() {
            return this.capital;
        }

        public void setCapital(String capital) {
            this.capital = capital;
        }

        public int getFlagResource() {
            return this.flagResource;
        }

        public void setFlagResource(int flagResource) {
            this.flagResource = flagResource;
        }
    }

