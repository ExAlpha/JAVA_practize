package pack;

public class User
{
    public String name;
    public String nick;
    public int age;

    public User(String name, String nick, int age)
    {
        this.name = name;
        this.nick = nick;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getNick()
    {
        return nick;
    }

    public void setNick(String nick)
    {
        this.nick = nick;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj == null)
            return false;
        if(this.getClass() != obj.getClass())
            return false;
        User user=(User) obj;
        return age == user.age &&
                nick.equals(user.nick) &&
                name.equals(user.name);
    }

    @Override
    public String toString()
    {
        return "User{" +
                "name='" + name + '\'' +
                ", nick='" + nick + '\'' +
                ", age=" + age +
                '}';
    }

}




