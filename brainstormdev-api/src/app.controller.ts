import { Controller, Get } from '@nestjs/common';
import { AppService } from './app.service';

@Controller()
export class AppController {
  constructor(private readonly appService: AppService) {}

  @Get()
  getHello(): string {
    return this.appService.getHello();
  }

  @Get('/teste')
  teste(): string {
    return this.appService.getHello();
  }

  @Get('/novo/endpooint')
  teste2(): string {
    return this.appService.getHello();
  }

  
}
