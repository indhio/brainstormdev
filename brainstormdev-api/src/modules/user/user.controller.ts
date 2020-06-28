import { Body, Controller, Delete, Get, HttpStatus, Param, Post, Put, Res } from '@nestjs/common';
import { UserService } from './user.service';

@Controller('api/user')
export class UserController {

  constructor(private readonly service: UserService) { }

  @Get('/list')
  list(): Promise<any> {
    return this.service.list();
  }

  @Get('/:id')
  getById(@Param() params): Promise<any> {
    return this.service.getById(params.id);
  }

  @Post('/create')
  create(@Res() res, @Body() obj: any): Promise<void> {
    return this.service.create(obj).then((result: any) => {
      res.status(HttpStatus.CREATED).send(result);
    }).catch(err => {
      res.status(HttpStatus.INTERNAL_SERVER_ERROR).send(err);
    });
  }

  @Put('/update')
  update(@Res() res, @Body() obj: any): Promise<void> {
    return this.service.update(obj).then((result: any) => {
      res.status(HttpStatus.CREATED).send(result);
    }).catch(err => {
      res.status(HttpStatus.INTERNAL_SERVER_ERROR).send(err);
    });
  }

  @Delete('/delete/:id')
  delete(@Param() params): Promise<void> {
    return this.service.delete(params.id);
  }

}
