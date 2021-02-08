package my.company.byeservice.service;

import my.company.byeservice.model.Bye;
import my.company.byeservice.repository.ByeRepository;
import org.springframework.stereotype.Service;

@Service
public class ByeServiceImpl implements ByeService {

    private final ByeRepository byeRepository;

    public ByeServiceImpl(ByeRepository byeRepository) {
        this.byeRepository = byeRepository;
    }

    @Override
    public void saveByeCount() {
        Bye bye = byeRepository.findById(1L).get();
        int count = bye.getCount() + 1;
        bye.setCount(count);
        byeRepository.save(bye);
    }
}
