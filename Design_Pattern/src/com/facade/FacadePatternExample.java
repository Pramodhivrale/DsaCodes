package com.facade;

//Subsystem class: DVDPlayer
class DVDPlayer {
 public void on() {
     System.out.println("DVD Player is on.");
 }

 public void play(String movie) {
     System.out.println("Playing movie: " + movie);
 }

 public void off() {
     System.out.println("DVD Player is off.");
 }
}

//Subsystem class: Projector
class Projector {
 public void on() {
     System.out.println("Projector is on.");
 }

 public void setInput(DVDPlayer dvdPlayer) {
     System.out.println("Projector input set to DVD Player.");
 }

 public void off() {
     System.out.println("Projector is off.");
 }
}

//Subsystem class: SoundSystem
class SoundSystem {
 public void on() {
     System.out.println("Sound system is on.");
 }

 public void setVolume(int level) {
     System.out.println("Sound system volume set to " + level);
 }

 public void off() {
     System.out.println("Sound system is off.");
 }
}

//Facade class: HomeTheaterFacade
class HomeTheaterFacade {
 private DVDPlayer dvdPlayer;
 private Projector projector;
 private SoundSystem soundSystem;

 public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem) {
     this.dvdPlayer = dvdPlayer;
     this.projector = projector;
     this.soundSystem = soundSystem;
 }

 public void watchMovie(String movie) {
     System.out.println("Get ready to watch a movie...");
     projector.on();
     projector.setInput(dvdPlayer);
     soundSystem.on();
     soundSystem.setVolume(10);
     dvdPlayer.on();
     dvdPlayer.play(movie);
 }

 public void endMovie() {
     System.out.println("Shutting down movie theater...");
     dvdPlayer.off();
     soundSystem.off();
     projector.off();
 }
}

//Client code
public class FacadePatternExample {
 public static void main(String[] args) {
     DVDPlayer dvdPlayer = new DVDPlayer();
     Projector projector = new Projector();
     SoundSystem soundSystem = new SoundSystem();

     HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, soundSystem);

     homeTheater.watchMovie("Inception");
     homeTheater.endMovie();
 }
}

