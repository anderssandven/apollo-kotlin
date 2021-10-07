// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.input_field_default_value.type;

import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.InputFieldMarshaller;
import com.apollographql.apollo.api.internal.InputFieldWriter;
import com.apollographql.apollo.api.internal.Utils;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import org.jetbrains.annotations.NotNull;

public final class Input implements InputType {
  private final @NotNull Filter filter;

  private transient volatile int $hashCode;

  private transient volatile boolean $hashCodeMemoized;

  Input(@NotNull Filter filter) {
    this.filter = filter;
  }

  public @NotNull Filter filter() {
    return this.filter;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public InputFieldMarshaller marshaller() {
    return new InputFieldMarshaller() {
      @Override
      public void marshal(InputFieldWriter writer) throws IOException {
        writer.writeObject("filter", filter.marshaller());
      }
    };
  }

  @Override
  public int hashCode() {
    if (!$hashCodeMemoized) {
      int h = 1;
      h *= 1000003;
      h ^= filter.hashCode();
      $hashCode = h;
      $hashCodeMemoized = true;
    }
    return $hashCode;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Input) {
      Input that = (Input) o;
      return this.filter.equals(that.filter);
    }
    return false;
  }

  public static final class Builder {
    private @NotNull Filter filter;

    Builder() {
    }

    public Builder filter(@NotNull Filter filter) {
      this.filter = filter;
      return this;
    }

    public Input build() {
      Utils.checkNotNull(filter, "filter == null");
      return new Input(filter);
    }
  }
}