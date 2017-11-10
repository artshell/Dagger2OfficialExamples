package com.artshell;

import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerCoffeeApp_Coffee implements CoffeeApp.Coffee {
  private Provider<Heater> provideHeaterProvider;

  private DaggerCoffeeApp_Coffee(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static CoffeeApp.Coffee create() {
    return new Builder().build();
  }

  private Thermosiphon getThermosiphon() {
    return new Thermosiphon(provideHeaterProvider.get());
  }

  private Pump getPump() {
    return Preconditions.checkNotNull(
        PumpModule.providePump(getThermosiphon()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.provideHeaterProvider =
        DoubleCheck.provider(DripCoffeeModule_ProvideHeaterFactory.create());
  }

  @Override
  public CoffeeMaker marker() {
    return new CoffeeMaker(DoubleCheck.lazy(provideHeaterProvider), getPump());
  }

  public static final class Builder {
    private Builder() {}

    public CoffeeApp.Coffee build() {
      return new DaggerCoffeeApp_Coffee(this);
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder dripCoffeeModule(DripCoffeeModule dripCoffeeModule) {
      Preconditions.checkNotNull(dripCoffeeModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder pumpModule(PumpModule pumpModule) {
      Preconditions.checkNotNull(pumpModule);
      return this;
    }
  }
}
