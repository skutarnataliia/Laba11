package ua.edu.ucu.apps.task3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProxyImage implements MyImage{
    private String path;

    @Override
    public void display() {
        RealImage img = new RealImage(this.path);
        img.display();
    }
}
