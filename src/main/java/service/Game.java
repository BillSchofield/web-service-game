package service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class Game  {
    private Map<Integer, Entity> entities;
    private Integer currentEntityId = 0;

    public Game() {
        this.entities = new HashMap();
    }

    @Scheduled(fixedDelay = 20)
    public void process() {
        for (Entity entity : entities.values()) {
            entity.update();
        }
    }

    public Entity entity(Integer id) {
        if (entities.containsKey(id)){
            return entities.get(id);
        }
        return null;
    }

    public Integer newPlayer() {
        currentEntityId++;
        entities.put(currentEntityId, new Entity(new Vector2d(200, 200)));
        return currentEntityId;
    }

    public List<String> entities() {
        return null;
    }
}