interface Expression<T> {
    T interpret(Context context);
}