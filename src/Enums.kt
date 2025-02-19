enum class UserRole(val accessLevel: Int) {
    ADMIN(3),
    EDITOR(2),
    VIEWER(1)
}

fun checkAccess(role: UserRole, requiredLevel: Int): Boolean {
    return role.accessLevel >= requiredLevel
}

fun main() {
    val admin = UserRole.ADMIN
    val editor = UserRole.EDITOR
    val viewer = UserRole.VIEWER

    println("Admin access: ${checkAccess(admin, 2)}")
    println("Editor access: ${checkAccess(editor, 2)}")
    println("Viewer access: ${checkAccess(viewer, 2)}")

    for (role in UserRole.values()) {
        println("${role.name} has access level ${role.accessLevel}")
    }
}
