import java.util.HashMap;
import java.util.Map;

/**
 * Classe que representa uma tela de login com funcionalidade de autenticação de usuário.
 */
public class LoginScreen {
    private Map<String, String> userDatabase;

    /**
     * Construtor da classe LoginScreen. Inicializa o banco de dados de usuários com usuários padrão.
     */
    public LoginScreen() {
        userDatabase = new HashMap<>();
        userDatabase.put("john", "password123");
        userDatabase.put("alice", "securepass");
    }

    /**
     * Autentica um usuário com o nome de usuário e senha fornecidos.
     *
     * @param username O nome de usuário do usuário a ser autenticado.
     * @param password A senha do usuário a ser autenticado.
     * @return true se a autenticação for bem-sucedida, false caso contrário.
     */
    public boolean login(String username, String password) {
        // Verifica se o nome de usuário existe no banco de dados
        if (userDatabase.containsKey(username)) {
            String storedPassword = userDatabase.get(username);
            // Verifica se a senha fornecida corresponde à senha armazenada
            if (storedPassword.equals(password)) {
                return true; // Autenticação bem-sucedida
            }
        }
        return false; // Autenticação falhou
    }

    /**
     * Adiciona um novo usuário ao banco de dados de usuários.
     *
     * @param username O nome de usuário do novo usuário a ser adicionado.
     * @param password A senha do novo usuário a ser adicionado.
     */
    public void addUser(String username, String password) {
        userDatabase.put(username, password); // Adiciona o novo usuário ao banco de dados
    }

}
