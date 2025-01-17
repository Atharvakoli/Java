public class InterviewPreparation {
    // ? Part 1: Java Functional Programming Interview - Questions and Answers
    // WHAT IS THE STRUCTURE OF A LAMBDA EXPRESSION?

    // The lambda expression has the following structure:

    // (method params) -> {lambda expression body}

    // where

    // method params - a list of input parameters separated by commas (if there are
    // more than one parameters, they are enclosed in brackets).

    // operator "->" - serves as a separator between the list of parameters of our
    // method and the body in which its implementation takes place.

    // lambda expression body - method body, consisting of one or more expressions
    // enclosed in curly braces.

    // WHAT VARIABLES DO LAMBDA EXPRESSIONS ACCESS TO?

    // Lambda expressions have access to the variables of the scope in which they
    // are defined. But access is possible only if the variables are effective
    // final, that is, either explicitly have the final modifier, or in case they do
    // not change their value after initialization, if the variable is assigned a
    // value for the second time, the lambda expression causes a compilation error.

    // WHAT IS METHOD REFERENCES?

    // Method references are compact lambda expressions that allow you to pass
    // references to methods or constructors. To do this, use the "::" keyword.

    // Reference methods implement a useful syntax to refer to existing methods or
    // constructors of Java classes or objects (instances). Together with lambda
    // expressions, reference methods make language constructs compact and concise,
    // making it boilerplate.

    // WHAT TYPES OF REFERENCES TO METHODS DO YOU KNOW?

    // There are three kinds of method references:

    // Reference to a static method(ContainingClass::staticMethodName)

    // Reference to a concrete object method(containingObject::instanceMethodName)

    // Reference to constructor(ClassName::new), for generics (generics) Class< T
    // >::new.

    // EXPLAIN THE SYSTEM.OUT::PRINTLN EXPRESSION.

    // The System.out::println expression is a reference to the static println
    // method of the out object of the System class, which is equivalent to the x ->
    // System.out.println(x) lambda expression.

    // WHAT ARE FUNCTIONAL INTERFACES?

    // A functional interface is one that defines exactly one abstract method.

    // Java 8 introduced a new @FunctionalInterface annotation to mark an interface
    // as functional, this annotation is used to avoid accidentally adding abstract
    // methods to a functional interface. It's not required, but it's good coding
    // practice.

    // Functional interfaces allow us to use lambda expressions to instantiate such
    // interfaces.

    // The best example of a functional interface would be the java.lang.Runnable
    // interface with a single abstract run() method. Note that an interface can
    // include any number of default or static methods and still be functional,
    // because default and static methods are not abstract.

    // WHAT ARE STREAMS IN JAVA?

    // java.util.stream - introduced to support parallelization of computations in
    // streams. Provides the ability to process a sequence of elements by executing
    // one or more operations, which can be performed either sequentially or in
    // parallel. Streams are divided into serial and parallel. The biggest benefit
    // of this is when working with collections.

    // Operations on a stream are either intermediate or terminal. All intermediate
    // operations return a stream, so we can combine multiple intermediate
    // operations without using a semicolon. Terminal operations return void or a
    // non-stream result.

    // WHAT IS THE COLLECT METHOD FOR?

    // Most operations of the Stream class that modify a dataset return that dataset
    // as a stream. However, there are situations when you would like to receive
    // data not as a stream, but as a regular collection, for example, ArrayList or
    // HashSet. And for this, the Stream class has a collect method. The method
    // takes as a parameter a conversion function to a collection:

    // <R,A> R collect(Collector<? super T,A,R> collector)

    // The R parameter represents the result type of the method, the T parameter is
    // the type of the element in the stream, and the A parameter is the type of the
    // intermediate accumulated data. As a result, the collector parameter
    // represents the function of converting the stream into a collection.

    // WHAT IS THE DIFFERENCE BETWEEN A COLLECTION AND A STREAM?

    // The difference between a Collection (Collection) of data and a stream
    // (Stream) from the new JDK8 is that collections allow you to work with
    // elements individually, while a stream (Stream) does not. For example, with
    // collections, you can add items, remove items, and insert in the middle. A
    // Stream does not allow you to manipulate individual elements from a data set,
    // but instead allows you to perform functions on the data as a whole.

    // WHAT IS THE FOREACH METHOD IN STREAMS FOR?

    // Method void forEach(Consumer<? super T> action) - action is performed for
    // each element. forEach is a terminal operation, used to iterate over each
    // element of the stream.

    // forEach does not guarantee the sequence of displaying elements in a parallel
    // stream, for this the forEachOrdered method is used - it guarantees the order.

    // WHAT IS THE MAP METHOD IN STREAMS FOR?

    // Method <R> Stream<R> map(Function<? super T,? extends R> mapper) - converts
    // elements of type T into elements of type R and returns a stream with elements
    // of R.

    // map() is an intermediate operation, the method is used to convert elements to
    // another object using the passed function.

    // WHAT IS THE PURPOSE OF THE FILTER METHOD IN STREAMS?

    // Method Stream<T> filter(Predicate<? super T> predicate) - filters elements
    // according to the condition in the predicate. filter is an intermediate
    // operation, used to filter an array through a function.

    // In fact, filter does not perform filtering, instead it creates a new stream,
    // which, when completed, contains the elements of the original stream that
    // match the given predicate.

    // WHAT IS THE LIMIT METHOD IN STREAMS FOR?

    // Method Stream<T> limit(long maxSize) - leaves only maxSize elements in the
    // stream. limit is an intermediate operation, used to fetch the first maxSize
    // elements of the stream. This method also returns a modified stream that has
    // no more than maxSize elements.

    // WHAT IS THE SORTED METHOD IN STREAMS FOR?

    // The Stream<T> sorted()/Stream<T> sorted(Comparator<? super T> comparator)
    // method returns a sorted stream. sorted() is an intermediate operation, a
    // method used to sort a stream using the natural order of comparison of its
    // elements. There is also a second sorted() method that takes either a
    // Comparable instance or its corresponding lambda expression.

    // PARALLEL STREAM PROCESSING IN JAVA?

    // To make a normal serial stream parallel, call the parallel method on the
    // Stream object.

    // Alternatively, you can also use the parallelStream() method of the Collection
    // interface to create a parallel stream from a collection.

    // At the same time, if the working machine is not multi-core, then the thread
    // will be executed as serial.

    // ? Part 2: Java Functional Programming Interview - Questions and Answers
    // WHAT IS THE BICONSUMER<T,U> FUNCTIONAL INTERFACE FOR?

    // Represents an operation that takes two input parameters and returns no
    // result.

    // WHAT IS THE BIFUNCTION<T,U,R> FUNCTIONAL INTERFACE FOR?

    // It is a function that takes two arguments and returns a result.

    // WHAT IS THE BINARYOPERATOR<T> FUNCTIONAL INTERFACE FOR?

    // Represents an operation on two operands of the same type, performs a binary
    // operation on them, and returns a result of the same type as the operands.

    // WHAT IS THE BIPREDICATE<T,U> FUNCTIONAL INTERFACE FOR?

    // Represents a predicate (boolean function) of two arguments.

    // WHAT IS THE BOOLEANSUPPLIER FUNCTIONAL INTERFACE FOR?

    // Represents a boolean result provider.

    // WHAT IS THE CONSUMER<T> FUNCTIONAL INTERFACE FOR?

    // Represents an operation that takes one input argument, performs some action
    // on an object of type T, and returns nothing.

    // WHAT IS THE DOUBLEBINARYOPERATOR FUNCTIONAL INTERFACE FOR?

    // Represents an operation on two operands of type double, returns a result of
    // type double.

    // WHAT IS THE DOUBLECONSUMER FUNCTIONAL INTERFACE FOR?

    // Represents an operation that takes one double argument and does not return a
    // result.

    // WHAT IS THE DOUBLEFUNCTION<R> FUNCTIONAL INTERFACE FOR?

    // Represents a function that takes one double argument and returns a result.

    // WHAT IS THE DOUBLEPREDICATE FUNCTIONAL INTERFACE FOR?

    // Represents a predicate (boolean function) of one double argument.

    // WHAT IS THE DOUBLESUPPLIER FUNCTIONAL INTERFACE FOR?

    // Represents the provider of double results.

    // WHAT IS THE DOUBLETOINTFUNCTION FOR?

    // It is a function that takes one argument of type double and returns the
    // result of type int.

    // WHY IS THE DOUBLETOLONGFUNCTION FUNCTIONAL INTERFACE FOR?

    // Represents a function that takes one argument of type double and returns a
    // result of type long.

    // WHAT IS THE DOUBLEUNARYOPERATOR FUNCTIONAL INTERFACE FOR?

    // Represents an operation on one argument of double type, returns a result of
    // type double.

    // WHAT IS THE FUNCTION<T,R> INTERFACE FOR?

    // Represents a transition function from an object of type T to an object of
    // type R.

    // WHAT IS THE INTBINARYOPERATOR FUNCTIONAL INTERFACE FOR?

    // Represents an operation on two operands of type int, returns a result of type
    // int.

    // WHAT DOES THE INTCONSUMER FUNCTIONAL INTERFACE NEED FOR?

    // Represents an operation that takes a single int argument and returns no
    // result.

    // WHAT IS INTFUNCTION<R> FOR?

    // Represents an operation that takes one int argument and returns a result.

    // WHAT IS THE INTPREDICATE FUNCTIONAL INTERFACE FOR?

    // Represents a predicate (boolean function) of one int argument.

    // WHAT DOES THE INTSUPPLIER FUNCTIONAL INTERFACE NEED FOR?

    // Represents an int result provider.

    // WHAT DOES INTTODOUBLEFUNCTION DO FOR?

    // Represents a function that takes one argument of type int and returns a
    // result of type double.

    // WHY IS THE INTTOLONGFUNCTION FUNCTIONAL INTERFACE FOR?

    // Represents a function that takes one argument of type int and returns a
    // result of type long.

    // WHAT DOES THE INTUNARYOPERATOR FUNCTIONAL INTERFACE NEED FOR?

    // Represents an operation on a single argument of type int, returns a result of
    // type int.

    // WHAT IS A LONGBINARYOPERATOR FUNCTIONAL INTERFACE FOR?

    // Represents an operation on two operands of type long, returns a result of
    // type long.

    // WHAT IS THE LONGCONSUMER FUNCTIONAL INTERFACE FOR?

    // Represents an operation that takes one long argument and does not return a
    // result.

    // WHAT IS THE LONGFUNCTION<R> FUNCTION INTERFACE FOR?

    // Represents a function that takes one long argument and returns a result.

    // WHAT IS THE LONGPREDICATE FUNCTIONAL INTERFACE FOR?

    // Represents a predicate (boolean function) of one argument of type long.

    // WHAT DOES THE LONGSUPPLIER FUNCTIONAL INTERFACE NEED FOR?

    // Represents a provider of long results.

    // WHAT IS THE LONGTODOUBLEFUNCTION FUNCTION INTERFACE FOR?

    // Represents a function that takes one argument of type long and returns a
    // result of type double.

    // WHAT IS A LONGTOINTFUNCTION FUNCTION INTERFACE FOR?

    // Represents a function that takes one argument of type long and returns a
    // result of type int.

    // WHAT DOES THE LONGUNARYOPERATOR FUNCTIONAL INTERFACE NEED FOR?

    // Represents an operation on a single argument of type long, returns a result
    // of type long.

    // WHAT IS THE OBJDOUBLECONSUMER<T> FUNCTIONAL INTERFACE FOR?

    // Represents an operation that takes one argument of type object and a second
    // of type double, and does not return a result.

    // WHAT IS THE OBJINTCONSUMER<T> FUNCTIONAL INTERFACE FOR?

    // Represents an operation that takes one argument of type object and a second
    // of type int and does not return a result.

    // WHAT IS THE OBJLONGCONSUMER<T> FUNCTIONAL INTERFACE FOR?

    // Represents an operation that takes one argument of type object and a second
    // of type long, and does not return a result.

    // WHAT IS THE PREDICATE<T> FUNCTIONAL INTERFACE FOR?

    // Represents a predicate (boolean function) of one argument.

    // WHAT IS THE SUPPLIER<T> FUNCTIONAL INTERFACE FOR?

    // Represents a results provider.

    // WHAT IS TODOUBLEBIFUNCTION<T,U> FUNCTIONAL INTERFACE FOR?

    // It is a function that takes two arguments and returns a result of double
    // type.

    // WHAT IS THE TODOUBLEFUNCTION<T> FUNCTIONAL INTERFACE FOR?

    // It is a function that takes one argument and returns a double result.

    // WHAT IS TOINTBIFUNCTION<T,U> FUNCTIONAL INTERFACE FOR?

    // It is a function that takes two arguments and returns an int result.

    // WHAT IS TOINTFUNCTION<T> FUNCTIONAL INTERFACE FOR?

    // It is a function that takes one argument and returns an int result.

    // WHAT IS TOLONGBIFUNCTION<T,U> FUNCTIONAL INTERFACE FOR?

    // It is a function that takes two arguments and returns a long result.

    // WHAT IS THE TOLONGFUNCTION<T> FUNCTION INTERFACE FOR?

    // It is a function that takes one argument and returns a result of type long.

    // WHAT IS THE UNARYOPERATOR<T> FUNCTIONAL INTERFACE FOR?

    // Represents an operation on a single operand, returns a result of the same
    // type as the operand.
}
