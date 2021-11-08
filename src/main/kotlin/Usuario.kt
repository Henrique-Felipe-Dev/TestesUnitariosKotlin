class Usuario(val nome: String, var email: String, var senha: String) {

    fun verificarNome(): Boolean{
        return nome != ""
    }

    fun verificarEmail(): Boolean{
        return email != ""
    }

    fun verificarTamanhoSenha(): Boolean{
        return senha.length in 8..16
    }


}