package com.fa.mock.Services.admin;

import java.util.List;

import com.fa.mock.Model.admin.statustic;
import org.springframework.stereotype.Service;

@Service
public interface Statustic {
	public List<statustic> getStatustic();
}
