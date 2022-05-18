package io.getarrays.server.service.implementation;

import io.getarrays.server.model.Server;
import io.getarrays.server.service.ServerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;


@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class ServerServiceImpl implements ServerService {
    private  final  ServerRepo serverRepo;


    @Override
    public Server create(Server server) {

        log.info("saving new server : {}", server.getName());
        server.setImageUrl(setServerImageUrl ());
        return null;
    }

    private String setServerImageUrl() {
        return null;
    }

    @Override
    public Server ping(String ipAddress) {
        return null;
    }

    @Override
    public Collection<Server> list(int limit) {
        return null;
    }

    @Override
    public Server get(long id) {
        return null;
    }

    @Override
    public Server update(long id) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
