package zlf.com;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/user")
public interface ServiceAlnterface {
   @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    User getById(@PathVariable("id") Long id);

}
