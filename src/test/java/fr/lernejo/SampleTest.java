package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    @Test
    void op() {
        Sample sample = new Sample();
        Assertions.assertThat(sample.op(Sample.Operation.ADD, 4, 6)).isEqualTo(10);
        Assertions.assertThat(sample.op(Sample.Operation.MULT, 4, 6)).isEqualTo(24);    }

    @Test
    void fact() {
        Sample sample = new Sample();
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> sample.fact(-1));
    }


}
