package com.xworkz.groupism.function;

import java.util.Comparator;
import java.util.function.*;

public class FunctionRunner {
    long left;
    long right;

//    public FunctionRunner(long left,long right){
//        this.left=left;
//        this.right=right;
//    }
    public static void main(String[] args) {
        BiConsumer<String,Integer> biConsumer=(name,age)->{
            System.out.println("running accept in BiConsumer");
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
        };


        biConsumer.accept("Sonal",21); //inboxing-->int to Integer..

        BiFunction<Double,Double,Double> biFunction=(dividend,divisor)->{
            System.out.println("running apply in BiFunction");
            Double quotient=dividend/divisor;
            return quotient;
        };

        Double result=biFunction.apply(10.0,2.0);
        System.out.println(result);

        //BinaryOperator<Integer> binaryOperator=(Comparator comparator)->{return comparator;};

        BiPredicate<Integer,Integer> biPredicate=(num1,num2)->{
            System.out.println("running test in BiPredicate");
            if(num1==num2){
                return true;
            }
            return false;
        };

        boolean predicateResult=biPredicate.test(11,23);
        System.out.println(predicateResult);

        BooleanSupplier booleanSupplier=()->{
            System.out.println("running getAsBoolean in BooleanSupplier");
            return true;
        };

        System.out.println(booleanSupplier.getAsBoolean());

        Consumer consumer=(name)->{
            System.out.println("running accept in Consumer");
            System.out.println("Name: "+name);
        };

        consumer.accept("Sonal");

        DoubleBinaryOperator doubleBinaryOperator=(left,right)->{
            System.out.println("running applyAsDouble in DoubleBinaryOperator");
            return left+right;
        };
        Double ans=doubleBinaryOperator.applyAsDouble(10.0,30.0);
        System.out.println(ans);

        DoubleConsumer doubleConsumer=(value)->{
            System.out.println("running accept in DoubleConsumer");
            System.out.println("value: "+value);
        };
        doubleConsumer.accept(30.0);

        DoubleFunction<Double> doubleFunction=(value)->{
            System.out.println("running apply in DoubleFunction");
            System.out.println("value: "+value);
            return value;
        };
        doubleFunction.apply(15.0);

        DoublePredicate doublePredicate=(value)->{
            System.out.println("running test in DoublePredicate");
            if(value==11.09){
                return true;

            }
            return false;
        };
        doublePredicate.test(11.09);

        DoubleSupplier doubleSupplier=()->{
            System.out.println("running getAsDouble in DoubleSupplier");
            double supply=100.999;
            return supply;
        };
        System.out.println(doubleSupplier.getAsDouble());

        DoubleToIntFunction doubleToIntFunction=(price)->{
            System.out.println("running applyAsInt in DoubleToIntFunction");
            int amount= (int) price;
            return amount;
        };
        System.out.println(doubleToIntFunction.applyAsInt(20.999));

        DoubleToLongFunction doubleToLongFunction=(value)->{
            System.out.println("running applyAsLong in DoubleToLongFunction");
            long longValue= (long) value;
            return longValue;

        };

        System.out.println("long value: "+doubleToLongFunction.applyAsLong(459.8765));


        DoubleUnaryOperator doubleUnaryOperator=(operand)->{
            System.out.println("running applyAsDouble in DoubleUnaryOperator");
            double square=operand*operand;
            return square;
        };
        System.out.println("square value: "+doubleUnaryOperator.applyAsDouble(3456));

        IntBinaryOperator intBinaryOperator=(left,right)->left+right;
        System.out.println(intBinaryOperator.applyAsInt(25,78));

        IntConsumer intConsumer=(value)->{
            System.out.println("running accept in IntConsumer");
            System.out.println("value: "+value);
        };
        intConsumer.accept(290);

        IntFunction<String> intFunction=(value)->{
            System.out.println("running apply in IntFunction");
            if(value>18){
                return "Valid age to vote";
            }
            return "Cannot vote";
        };

        intFunction.apply(19);

        IntPredicate intPredicate=(value)->{
            System.out.println("running test in IntPredicate");
            if(value==2) return true;
            return false;
        };

        intPredicate.test(3);


        IntSupplier intSupplier=()->{
            System.out.println("running getAsInt in IntSupplier");
            return 100;
        };
        System.out.println("value returned as int: "+intSupplier.getAsInt());

        IntToDoubleFunction intToDoubleFunction=(value)->{
            System.out.println("running applyAsDouble in IntToDoubleFunction");
            double doubleValue=(double) value;
            return doubleValue;
        };
        System.out.println("double value: "+intToDoubleFunction.applyAsDouble(234));

        IntToLongFunction intToLongFunction=(value)->{
            System.out.println("running applyAsLong in IntToLong");
            long longValue=(long) value;
            return  longValue;
        };
        System.out.println("longValue: "+intToLongFunction.applyAsLong(567898765));

        IntUnaryOperator intUnaryOperator=(operand)->{
            System.out.println("running apllyAsInt in IntUnaryOperator");
            return operand*operand;
        };
        System.out.println("result: "+intUnaryOperator.applyAsInt(9));

        LongBinaryOperator longBinaryOperator=(left,right)->{
            System.out.println("running applyAsLong in LongBinaryOperator");
            return left-right;

        };
        System.out.println("result: "+longBinaryOperator.applyAsLong(20,17));

        LongConsumer longConsumer=(value)->{
            System.out.println("running accept in LongConsumer");
            System.out.println("value: "+value);
        };


        LongFunction<Boolean> longFunction=(phone)->{
            if(phone!=7406508813L){
                return false;
            }
            return true;
        };
        System.out.println("result: "+longFunction.apply(9740126919L));

        LongPredicate longPredicate=(studentId)->{
            if(studentId!=37){
                return false;
            }
            return true;
        };
        System.out.println("student id is correct?: "+longPredicate.test(38));

        LongSupplier longSupplier=()->{
            System.out.println("running getAsLong in LongSupplier");
            long contact=9739257715L;
            return contact;
        };
        System.out.println("contact number is: "+longSupplier.getAsLong());

        LongToDoubleFunction longToDoubleFunction=(value)->{
            double doubleValue=(double) value;
            return doubleValue;
        };
        System.out.println("double value: "+longToDoubleFunction.applyAsDouble(3456798));
        LongToIntFunction longToIntFunction=(value)->{
            System.out.println("running applyAsInt in LongToInt");
            int intValue=(int) value;
            return intValue;
        };
        System.out.println("int Value: "+longToIntFunction.applyAsInt(123));

        LongUnaryOperator longUnaryOperator=(operand)->{
            System.out.println("running applyAsLong of LongUnaryOperator");
            operand=operand+1;
            return operand;

        };
        System.out.println("next value: "+ longUnaryOperator.applyAsLong(852));

        ObjDoubleConsumer<String> objDoubleConsumer=(name,salary)->{
            System.out.println("Name: "+name);
            System.out.println("Salary: "+salary);
        };
        objDoubleConsumer.accept("Sonal",63852.00);

        ObjIntConsumer<String> objIntConsumer=(name,rollNo)->{
            System.out.println("name: "+name);
            System.out.println("rollNo: "+rollNo);
        };
        objIntConsumer.accept("Sonal",37);

        ObjLongConsumer<String> objLongConsumer=(name,phone)->{
            System.out.println("Name: "+name);
            System.out.println("Phone: "+phone);
        };
        objLongConsumer.accept("Sonal",7483420737L);


        Predicate<String> predicate=(name)->{
            if(name.equalsIgnoreCase("Sonal")) return true;
            return false;
        };
        System.out.println("name match result: "+predicate.test("SONAL"));

        Supplier<String> supplier=()->{
            System.out.println("name is ");
            return "Sonal";
        };
        System.out.println(supplier.get());

        ToDoubleBiFunction<Integer,Long> toDoubleBiFunction=(intValue,longValue)->{
            double difference=(double) longValue-(double) intValue;
            return difference;
        };
        System.out.println("difference: "+toDoubleBiFunction.applyAsDouble(4536,987456321L));

        ToDoubleFunction<Integer> toDoubleFunction=(intValue)->{
            return (double) intValue;
        };
        System.out.println(toDoubleFunction.applyAsDouble(7418));

        ToIntBiFunction<Long,Double> toIntBiFunction=(longValue,doubleValue)->{
            if(longValue==456321 && doubleValue==741.00){
                return 1;
            }
            return 0;
        };
        toIntBiFunction.applyAsInt(456321L,741.00);

//        ToIntFunction<Long> toIntFunction=(longValue)->{
////            return (int) longValue;
//        };
////        ToLongBiFunction<> toLongBiFunction=()->{};
//        ToLongFunction<> toLongFunction=()->{};
//
//        UnaryOperator<> unaryOperator=()->{};







    }
}
