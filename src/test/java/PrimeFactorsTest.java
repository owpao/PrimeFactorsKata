import com.google.common.collect.ImmutableList;
import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertThat;

public class PrimeFactorsTest {
    @Test
    public void of_1_is_none(){
        assertThat(PrimeFactors.of(1), Is.<List<Integer>>is(ImmutableList.<Integer>of()));
    }

    @Test
    public void of2_is_2(){
        assertThat(PrimeFactors.of(2), Is.<List<Integer>>is(ImmutableList.of(2)));
    }

    @Test
    public void of3_is_3(){
        assertThat(PrimeFactors.of(3), Is.<List<Integer>>is(ImmutableList.of(3)));
    }

    @Test
    public void of4_is_2_and_2(){
        assertThat(PrimeFactors.of(4), Is.<List<Integer>>is(ImmutableList.of(2,2)));
    }

    @Test
    public void of6_is_2_and_3(){
        assertThat(PrimeFactors.of(6), Is.<List<Integer>>is(ImmutableList.of(2,3)));
    }

    @Test
    public void of8_is_2_and_2_and_2(){
        assertThat(PrimeFactors.of(8), Is.<List<Integer>>is(ImmutableList.of(2,2,2)));
    }

    @Test
    public void of9_is_3_and_3(){
        assertThat(PrimeFactors.of(9), Is.<List<Integer>>is(ImmutableList.of(3,3)));
    }

    @Test
    public void of_acceptanceTest(){
        assertThat(PrimeFactors.of(2*2*2*3*3*5*7*11), Is.<List<Integer>>is(ImmutableList.of(2,2,2,3,3,5,7,11)));
    }
}