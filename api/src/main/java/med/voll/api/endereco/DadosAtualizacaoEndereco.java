package med.voll.api.endereco;

public record DadosAtualizacaoEndereco(
        String logradouro,
        String bairro,
        String cep,
        String cidade,
        String uf,
        String complemento,
        String numero) {
}
