class UserViewModel : ViewModel() {

```
val users = mutableListOf<User>()

fun fetchUsers() {
    GlobalScope.launch {
        val response = api.getUsers()
        users.clear()
        users.addAll(response)
    }
}
```

}
