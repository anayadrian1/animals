package edu.cnm.deepdive.animals.service;

import android.content.Context;
import edu.cnm.deepdive.animals.model.Animal;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import java.util.List;

public class AnimalsRepository {

  private final Context context;

  private final AnimalService animalService;

  public AnimalsRepository(Context context) {
    animalService = AnimalService.getInstance();
    this.context = context;
  }

  public Single<List<Animal>> loadAnimals() {
    return animalService.getApiKey()
        .flatMap((key) -> animalService.getAnimals(key.getKey()))
        .subscribeOn(Schedulers.io());
  }
}
