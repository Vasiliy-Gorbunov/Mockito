package vasiliy.gorbunov.model;

public record User(String name, int age, boolean isMale) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && isMale == user.isMale && name.equals(user.name);
    }

}
