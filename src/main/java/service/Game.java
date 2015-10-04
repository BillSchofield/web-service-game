package service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Game  {


    private Entity entity;

    public Game() {
        this.entity = new Entity();
    }

    @Scheduled(fixedDelay = 20)
    public void process() {
        entity.update();
    }

    public Entity entity() {
        return entity;
    }
}