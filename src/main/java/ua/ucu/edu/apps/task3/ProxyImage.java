package ua.ucu.edu.apps.task3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProxyImage implements MyImage{
    private String name;

    @Override
    public void display() {
        RealImage img = new RealImage(this.name);
        img.display();
    }

}
