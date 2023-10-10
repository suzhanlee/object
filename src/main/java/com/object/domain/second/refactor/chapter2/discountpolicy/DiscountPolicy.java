package com.object.domain.second.refactor.chapter2.discountpolicy;

import com.object.domain.second.refactor.chapter2.Money;
import com.object.domain.second.refactor.chapter2.Screening;
import com.object.domain.second.refactor.chapter2.discountcondition.DiscountCondition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface DiscountPolicy {

    Money calculateDiscountAmount(Screening screening);
}
