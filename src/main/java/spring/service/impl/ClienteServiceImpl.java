package spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.model.Cliente;
import spring.model.ClienteRepository;
import spring.model.Endereco;
import spring.model.EnderecoRepository;
import spring.service.ClienteService;
import spring.service.ViaCepService;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {


    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;
    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        this.salvarClienteBuscaPorCep(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clienteEval = clienteRepository.findById(id);
        if (clienteEval.isPresent()) {
            this.salvarClienteBuscaPorCep(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }

    private void salvarClienteBuscaPorCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCEP(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }
}
