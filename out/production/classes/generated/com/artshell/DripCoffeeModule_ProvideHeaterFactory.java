package com.artshell;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DripCoffeeModule_ProvideHeaterFactory implements Factory<Heater> {
  private static final DripCoffeeModule_ProvideHeaterFactory INSTANCE =
      new DripCoffeeModule_ProvideHeaterFactory();

  @Override
  public Heater get() {
    return Preconditions.checkNotNull(
        DripCoffeeModule.provideHeater(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Heater> create() {
    return INSTANCE;
  }

  public static Heater proxyProvideHeater() {
    return DripCoffeeModule.provideHeater();
  }
}
